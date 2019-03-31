package org.openl.ie.constrainer;

///////////////////////////////////////////////////////////////////////////////
/*
 * Copyright Exigen Group 1998, 1999, 2000
 * 320 Amboy Ave., Metuchen, NJ, 08840, USA, www.exigengroup.com
 *
 * The copyright to the computer program(s) herein
 * is the property of Exigen Group, USA. All rights reserved.
 * The program(s) may be used and/or copied only with
 * the written permission of Exigen Group
 * or in accordance with the terms and conditions
 * stipulated in the agreement/contract under which
 * the program(s) have been supplied.
 */
///////////////////////////////////////////////////////////////////////////////
/**
 * A generic abstract implementation of the Constraint interface.
 * <p>
 * Any specific subclass of the ConstraintImpl should implement:
 * <ul>
 * <li>A special constructor that saves the variables constrained by this constraint.
 * </ul>
 *
 * @see Constraint
 * @see Goal
 * @see Observer
 */
public abstract class ConstraintImpl extends GoalImpl implements Constraint {
    /**
     * Constructor with a given constrainer.
     */
    public ConstraintImpl(Constrainer c) {
        this(c, "Constraint");
    }

    /**
     * Constructor with a given constrainer and name.
     */
    public ConstraintImpl(Constrainer c, String name) {
        super(c, name);
        // c.addConstraint(this);
    }

    @Override
    public void post() throws Failure {
        _constrainer.postConstraint(this);
    }
} // ~ConstraintImpl
