package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> students=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView A1 =findViewById(R.id.A1name);
        TextView A2 =findViewById(R.id.Age2);
        TextView A3 =findViewById(R.id.A3GRAD);
        ImageView A4 =findViewById(R.id.img);
        Button A5 =findViewById(R.id.button);

        Student s1=new Student("jousf",14,12,R.drawable.name);
        Student s2=new Student("salman",13,10,R.drawable.chad);
        Student s3=new Student("mashed",15,11,R.drawable.og);
        Student s4=new Student("megaMind",15,1000,R.drawable.mind);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);





        A4.setImageResource(students.get(0).getImge());
        A1.setText(students.get(0).getStudentName());
        A2.setText(String.valueOf(students.get(0).getStudentAge()));
        A3.setText(String.valueOf(students.get(0).getStudentGrade()));

    }
}
