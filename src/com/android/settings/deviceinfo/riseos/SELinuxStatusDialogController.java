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

import android.os.SELinux;
import android.support.annotation.VisibleForTesting;

import com.android.settings.R;

public class SELinuxStatusDialogController {

    @VisibleForTesting
    static final int SELINUX_STATUS_VALUE_ID = R.id.selinux_status_value;

    private final RiseOSVersionDialogFragment mDialog;

    public SELinuxStatusDialogController(RiseOSVersionDialogFragment dialog) {
        mDialog = dialog;
    }

    /**
     * Populates the SELinux status field in the dialog.
     */
    public void initialize() {
        if (SELinux.isSELinuxEnforced()) {
            mDialog.setText(SELINUX_STATUS_VALUE_ID,
                mDialog.getString(R.string.selinux_status_enforcing));
        } else if (!SELinux.isSELinuxEnforced()) {
            mDialog.setText(SELINUX_STATUS_VALUE_ID,
                mDialog.getString(R.string.selinux_status_permissive));
        } else if (!SELinux.isSELinuxEnabled()) {
            mDialog.setText(SELINUX_STATUS_VALUE_ID,
                mDialog.getString(R.string.selinux_status_disabled));
        }
    }
}
