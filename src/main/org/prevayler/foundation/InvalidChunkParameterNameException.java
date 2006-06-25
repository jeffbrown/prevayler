// Prevayler, The Free-Software Prevalence Layer
// Copyright 2001-2006 by Klaus Wuestefeld
//
// This library is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// FITNESS FOR A PARTICULAR PURPOSE.
//
// Prevayler is a trademark of Klaus Wuestefeld.
// See the LICENSE file for license details.

package org.prevayler.foundation;

import org.prevayler.PrevaylerIOException;

public class InvalidChunkParameterNameException extends PrevaylerIOException {

    private static final long serialVersionUID = 1L;

    public InvalidChunkParameterNameException() {
        super();
    }

    public InvalidChunkParameterNameException(String message) {
        super(message);
    }

    public InvalidChunkParameterNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidChunkParameterNameException(Throwable cause) {
        super(cause);
    }

}