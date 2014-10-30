/*
 * Copyright (c) 2014 aleon GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Markus Rathgeb - initial API and implementation and/or initial documentation
 */
package org.openhab.binding.aleoncean.internal.converter;

import org.openhab.binding.aleoncean.internal.ActionIn;

/**
 *
 * @author Markus Rathgeb <maggu2810@gmail.com>
 */
public abstract class ParameterItemClassConverter extends StandardConverter {

    public ParameterItemClassConverter(final ActionIn actionIn) {
        super(actionIn);
    }

}
