/*
 * Copyright 2010 Google Inc.
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
package com.google.gwt.sample.expenses.shared;

import com.google.gwt.requestfactory.shared.Id;
import com.google.gwt.requestfactory.shared.LongString;
import com.google.gwt.requestfactory.shared.ServerType;
import com.google.gwt.requestfactory.shared.EntityKey;
import com.google.gwt.requestfactory.shared.Version;
import com.google.gwt.valuestore.shared.Property;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * "Generated" proxy of
 * {@link com.google.gwt.sample.expenses.server.domain.Report domain.Report}.
 */
@ServerType(com.google.gwt.sample.expenses.server.domain.Report.class)
public class ReportKey implements EntityKey<ReportKey> {
  private static ReportKey instance;

  public static ReportKey get() {
    if (instance == null) {
      instance = new ReportKey();
    }
    return instance;
  }

  private final Property<ReportKey, String> id = new Property<ReportKey, String>(
      String.class, "id");

  private final Property<ReportKey, Integer> version = new Property<ReportKey, Integer>(
      Integer.class, "version");

  private final Property<ReportKey, Date> created = new Property<ReportKey, Date>(
      Date.class, "created");

  private final Property<ReportKey, String> purpose = new Property<ReportKey, String>(
      String.class, "purpose");

  private final Set<Property<ReportKey, ?>> properties = new HashSet<Property<ReportKey, ?>>();

  ReportKey() {
    properties.add(id);
    properties.add(version);
    properties.add(created);
    properties.add(purpose);
  }

  public Property<ReportKey, Date> getCreated() {
    return created;
  }

  @LongString
  @Id
  public Property<ReportKey, String> getId() {
    return id;
  }

  public Set<Property<ReportKey, ?>> getProperties() {
    return properties;
  }

  public Property<ReportKey, String> getPurpose() {
    return purpose;
  }

  @Version
  public Property<ReportKey, Integer> getVersion() {
    return version;
  }
}
