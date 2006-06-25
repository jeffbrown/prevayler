// Prevayler, The Free-Software Prevalence Layer
// Copyright 2001-2006 by Klaus Wuestefeld
//
// This library is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// FITNESS FOR A PARTICULAR PURPOSE.
//
// Prevayler is a trademark of Klaus Wuestefeld.
// See the LICENSE file for license details.

package org.prevayler.implementation;

import org.prevayler.Query;

import java.util.Date;

public class NullQuery extends Query<Object, Void, RuntimeException> {

    public Void executeOn(@SuppressWarnings("unused") Object prevalentSystem, @SuppressWarnings("unused") Date executionTime) {
        return null;
    }

}