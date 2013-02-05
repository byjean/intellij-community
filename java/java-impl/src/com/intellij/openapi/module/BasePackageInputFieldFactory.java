/*
 * Copyright 2000-2013 JetBrains s.r.o.
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
 */
package com.intellij.openapi.module;

import com.intellij.ide.util.projectWizard.WizardInputField;
import com.intellij.ide.util.projectWizard.WizardInputFieldFactory;

import javax.swing.*;

/**
 * @author Dmitry Avdeev
 *         Date: 2/1/13
 */
public class BasePackageInputFieldFactory implements WizardInputFieldFactory {

  private static final String IJ_BASE_PACKAGE = "IJ_BASE_PACKAGE";

  @Override
  public WizardInputField createField(String id, final String initialValue) {

    return IJ_BASE_PACKAGE.equals(id) ? new WizardInputField<JTextField>(IJ_BASE_PACKAGE) {

      private final JTextField myField = new JTextField(initialValue);

      @Override
      public String getLabel() {
        return "Base package:";
      }

      @Override
      public JTextField getComponent() {
        return myField;
      }

      @Override
      public String getValue() {
        return myField.getText();
      }
    } : null;
  }
}
