package org.openl.rules.lang.xls.binding.wrapper.base;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.openl.binding.BindingDependencies;
import org.openl.rules.lang.xls.binding.ATableBoundNode;
import org.openl.rules.lang.xls.syntax.TableSyntaxNode;
import org.openl.rules.table.properties.ITableProperties;
import org.openl.rules.tbasic.Algorithm;
import org.openl.rules.tbasic.AlgorithmSubroutineMethod;
import org.openl.rules.tbasic.runtime.operations.RuntimeOperation;
import org.openl.types.IMemberMetaInfo;
import org.openl.types.IMethodSignature;
import org.openl.types.IOpenClass;
import org.openl.types.IOpenMethod;
import org.openl.types.IOpenMethodHeader;
import org.openl.vm.IRuntimeEnv;

public abstract class AbstractAlgorithmWrapper extends Algorithm {
    static {
        WrapperValidation.validateWrapperClass(AbstractAlgorithmWrapper.class,
            AbstractAlgorithmWrapper.class.getSuperclass());
    }

    protected final Algorithm delegate;

    public AbstractAlgorithmWrapper(Algorithm delegate) {
        this.delegate = Objects.requireNonNull(delegate, "delegate cannot be null");
    }

    @Override
    public String getSourceUrl() {
        return delegate.getSourceUrl();
    }

    @Override
    public void setAlgorithmSteps(List<RuntimeOperation> algorithmSteps) {
        delegate.setAlgorithmSteps(algorithmSteps);
    }

    @Override
    public void setLabels(Map<String, RuntimeOperation> labels) {
        delegate.setLabels(labels);
    }

    @Override
    public void setThisClass(IOpenClass thisClass) {
        delegate.setThisClass(thisClass);
    }

    @Override
    public List<RuntimeOperation> getAlgorithmSteps() {
        return delegate.getAlgorithmSteps();
    }

    @Override
    public BindingDependencies getDependencies() {
        return delegate.getDependencies();
    }

    @Override
    public Collection<AlgorithmSubroutineMethod> getSubroutines() {
        return delegate.getSubroutines();
    }

    @Override
    public String getUri() {
        return delegate.getUri();
    }

    @Override
    public Object invoke(Object target, Object[] params, IRuntimeEnv env) {
        return delegate.invoke(target, params, env);
    }

    @Override
    public void setBoundNode(ATableBoundNode node) {
        delegate.setBoundNode(node);
    }

    @Override
    public ATableBoundNode getBoundNode() {
        return delegate.getBoundNode();
    }

    @Override
    public Map<String, Object> getProperties() {
        return delegate.getProperties();
    }

    @Override
    public ITableProperties getMethodProperties() {
        return delegate.getMethodProperties();
    }

    @Override
    public IMemberMetaInfo getInfo() {
        return delegate.getInfo();
    }

    @Override
    public TableSyntaxNode getSyntaxNode() {
        return delegate.getSyntaxNode();
    }

    @Override
    public boolean isConstructor() {
        return delegate.isConstructor();
    }

    @Override
    public String toString() {
        return delegate.toString();
    }

    @Override
    public String getModuleName() {
        return delegate.getModuleName();
    }

    @Override
    public void setModuleName(String dependencyName) {
        delegate.setModuleName(dependencyName);
    }

    @Override
    public IOpenClass getDeclaringClass() {
        return delegate.getDeclaringClass();
    }

    @Override
    public String getDisplayName(int mode) {
        return delegate.getDisplayName(mode);
    }

    @Override
    public IOpenMethodHeader getHeader() {
        return this;
    }

    @Override
    public IOpenMethod getMethod() {
        return this;
    }

    @Override
    public String getName() {
        return delegate.getName();
    }

    @Override
    public IMethodSignature getSignature() {
        return delegate.getSignature();
    }

    @Override
    public IOpenClass getType() {
        return delegate.getType();
    }

    @Override
    public boolean isStatic() {
        return delegate.isStatic();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AbstractAlgorithmWrapper that = (AbstractAlgorithmWrapper) o;
        return delegate.equals(that.delegate);
    }

    @Override
    public int hashCode() {
        return delegate.hashCode();
    }
}