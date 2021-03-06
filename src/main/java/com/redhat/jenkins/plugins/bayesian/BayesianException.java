package com.redhat.jenkins.plugins.bayesian;

/*
 * Copyright 2017 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *limitations under the License.
 */

public class BayesianException extends Exception {

    public BayesianException(String message, Throwable cause) {
        super(message, cause);
    }

    public BayesianException(String message) {
        super(message);
    }

    public BayesianException(Throwable cause) {
        super(cause);
    }

    private static final long serialVersionUID = 1L;
}
