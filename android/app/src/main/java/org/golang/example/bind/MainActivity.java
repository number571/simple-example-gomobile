/*
 * Copyright 2015 The Go Authors. All rights reserved.
 * Use of this source code is governed by a BSD-style
 * license that can be found in the LICENSE file.
 */

package org.golang.example.bind;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import hello.Hello;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTextView = findViewById(R.id.mytextview);

        // Call Go function.
        String greetings = Hello.greetings("Android and Gopher");
        mTextView.setText(greetings);
    }
}
