/*
 * Copyright (C) 2018 The Rise OS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.deviceinfo.riseosversion;

import android.os.Build;
import android.support.annotation.VisibleForTesting;
import android.text.BidiFormatter;

import com.android.settings.R;

public class RiseOSBuildNumberDialogController {

    @VisibleForTesting
    static final int BUILD_NUMBER_VALUE_ID = R.id.build_number_value;

    private final RiseOSVersionDialogFragment mDialog;

    public RiseOSBuildNumberDialogController(RiseOSVersionDialogFragment dialog) {
        mDialog = dialog;
    }

    /**
     * Updates the build number to the dialog.
     */
    public void initialize() {
        mDialog.setText(BUILD_NUMBER_VALUE_ID,
                BidiFormatter.getInstance().unicodeWrap(Build.DISPLAY));
    }
}
