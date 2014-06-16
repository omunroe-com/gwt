/*
 * Copyright 2006 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.dev.util.msg;

import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.TreeLogger.Type;

import java.lang.reflect.Method;

/**
 * Integer, Method, & String message.
 */
public final class Message3IntMethodString extends Message {

  public Message3IntMethodString(Type type, String fmt) {
    super(type, fmt, 3);
  }

  public TreeLogger branch(TreeLogger logger, int x, Method m, String s,
      Throwable caught) {
    Integer xi = Integer.valueOf(x);
    return branch(logger, xi, m, s, getFormatter(xi), getFormatter(m),
        getFormatter(s), caught);
  }

  public void log(TreeLogger logger, int x, Method m, String s, Throwable caught) {
    Integer xi = Integer.valueOf(x);
    log(logger, xi, m, s, getFormatter(xi), getFormatter(m), getFormatter(s),
        caught);
  }

}
