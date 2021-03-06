/*******************************************************************************
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 ******************************************************************************/

package com.amazonaws.services.cloudtrail.processinglibrary.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.cloudtrail.processinglibrary.exceptions.ProcessingLibraryException;
import com.amazonaws.services.cloudtrail.processinglibrary.interfaces.ExceptionHandler;

/**
 * Default implementation of {@link ExceptionHandler} that simply logs exceptions.
 */
public class DefaultExceptionHandler implements ExceptionHandler {
    private static final Log logger = LogFactory.getLog(DefaultExceptionHandler.class);

    @Override
    public void handleException(ProcessingLibraryException exception) {
        logger.error(exception.getMessage(), exception);
    }
}
