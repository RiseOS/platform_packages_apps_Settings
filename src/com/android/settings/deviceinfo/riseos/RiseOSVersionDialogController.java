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

import android.os.SystemProperties;
import android.support.annotation.VisibleForTesting;

import com.android.settings.R;

public class RiseOSVersionDialogController {

    private static final String KEY_ROS_VERSION_PROPERTY = "ro.ros.version";

    @VisibleForTesting
    static final int RISEOS_VERSION_VALUE_ID = R.id.ros_version_value;

    private final RiseOSVersionDialogFragment mDialog;

    public RiseOSVersionDialogController(RiseOSVersionDialogFragment dialog) {
        mDialog = dialog;
    }

    /**
     * Populates the Android version field in the dialog.
     */
    public void initialize() {
        mDialog.setText(RISEOS_VERSION_VALUE_ID, SystemProperties.get(KEY_ROS_VERSION_PROPERTY));
    }

}
