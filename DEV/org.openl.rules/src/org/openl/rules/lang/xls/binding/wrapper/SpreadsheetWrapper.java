package org.openl.rules.lang.xls.binding.wrapper;

import java.util.Objects;

import org.openl.rules.calc.Spreadsheet;
import org.openl.rules.lang.xls.binding.ModuleSpecificType;
import org.openl.rules.lang.xls.binding.XlsModuleOpenClass;
import org.openl.rules.lang.xls.binding.wrapper.base.AbstractSpreadsheetWrapper;
import org.openl.types.IMethodSignature;
import org.openl.types.IOpenClass;
import org.openl.types.IOpenMethod;
import org.openl.vm.IRuntimeEnv;

public final class SpreadsheetWrapper extends AbstractSpreadsheetWrapper implements IRulesMethodWrapper {

    private final XlsModuleOpenClass xlsModuleOpenClass;
    private final ContextPropertiesInjector contextPropertiesInjector;
    private final IOpenClass type;
    private final IMethodSignature methodSignature;
    private final TopClassOpenMethodWrapperCache topClassOpenMethodWrapperCache = new TopClassOpenMethodWrapperCache(
        this);

    public SpreadsheetWrapper(XlsModuleOpenClass xlsModuleOpenClass,
            Spreadsheet delegate,
            ContextPropertiesInjector contextPropertiesInjector) {
        super(delegate);
        this.xlsModuleOpenClass = Objects.requireNonNull(xlsModuleOpenClass, "xlsModuleOpenClass cannot be null");
        this.contextPropertiesInjector = contextPropertiesInjector;
        if (delegate.getType() instanceof ModuleSpecificType) {
            IOpenClass type = xlsModuleOpenClass.findType(delegate.getType().getName());
            this.type = type != null ? type : delegate.getType();
        } else {
            this.type = delegate.getType();
        }
        this.methodSignature = WrapperLogic.buildMethodSignature(delegate, xlsModuleOpenClass);
    }

    @Override
    public IOpenMethod getDelegate() {
        return delegate;
    }

    @Override
    public Object invoke(Object target, Object[] params, IRuntimeEnv env) {
        return WrapperLogic.invoke(this, target, params, env);
    }

    @Override
    public XlsModuleOpenClass getXlsModuleOpenClass() {
        return xlsModuleOpenClass;
    }

    @Override
    public IMethodSignature getSignature() {
        return methodSignature;
    }

    @Override
    public IOpenClass getType() {
        return type;
    }

    @Override
    public IOpenMethod getTopOpenClassMethod(IOpenClass openClass) {
        return topClassOpenMethodWrapperCache.getTopOpenClassMethod(openClass);
    }

    @Override
    public ContextPropertiesInjector getContextPropertiesInjector() {
        return contextPropertiesInjector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SpreadsheetWrapper that = (SpreadsheetWrapper) o;
        return delegate.equals(that.delegate);
    }

    @Override
    public int hashCode() {
        return delegate.hashCode();
    }
}
