package com.samsung.dali.modelconverter.view.parts;

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

import javax.annotation.PostConstruct;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;

public class DliTextPart {

  public static final String sId = "com.samsung.dali.modelconverter.part.dlitext";

  @PostConstruct
  public void createComposite(Composite parent) {

    text = new StyledText(parent, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
    text.setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
    text.setAlwaysShowScrollBars(false);
  }

  public void populate(String dli) {
    text.setText(dli);
  }

  private StyledText text;
}
