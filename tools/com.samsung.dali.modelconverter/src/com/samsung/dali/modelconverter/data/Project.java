package com.samsung.dali.modelconverter.data;

/*
 * Copyright (c) 2017 Samsung Electronics Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

public class Project {

  public static final String TIZEN_MANIFEST = "tizen-manifest.xml";

  public Project(String path, String name, String id) {
    assert path != null;
    assert !path.isEmpty();

    mPath = path;
    mName = name;
    mId = id;
  }

  public String getPath() {
    return mPath;
  }

  public String getName() {
    return mName;
  }

  public String getId() {
    return mId;
  }

  private String mPath;
  private String mName;
  private String mId;
}
