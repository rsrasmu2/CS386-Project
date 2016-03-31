package com.cs386.assignment.attendancetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        String lectureID = intent.getStringExtra(ClassList.LECTURE_ID_MESSAGE);
        String lectureName = intent.getStringExtra(ClassList.LECTURE_NAME_MESSAGE);
        Lecture lecture = new Lecture(lectureID, lectureName);

        TextView label = (TextView)findViewById(R.id.ClassName);
        label.setText(lecture.getName());
    }

}