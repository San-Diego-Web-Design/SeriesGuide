/*
 * Copyright 2011 Uwe Trottmann
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
 * 
 */

package com.battlelancer.seriesguide;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class WatchedBox extends ImageView {

    private boolean checked;

    public WatchedBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.checked = false;
        this.setImageResource(R.drawable.ic_action_watched);
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        updateStateImage();
    }

    public void toggle() {
        checked = !checked;
        updateStateImage();
    }

    private void updateStateImage() {
        if (checked) {
            this.setImageResource(R.drawable.ic_watched);
        } else {
            this.setImageResource(R.drawable.ic_action_watched);
        }
    }
}
