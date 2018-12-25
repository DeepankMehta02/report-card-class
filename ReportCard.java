/*
 * Copyright 2018 Deepank Mehta. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.deepankmehta.reportcard;

import java.util.ArrayList;

public class ReportCard {

    // Variables
    private String mStudentName;
    private int mYear;
    private ArrayList<String> mGrades = new ArrayList<String>();

    // Constructor
    public ReportCard(String studentName, int year, ArrayList<String> grades) {
        mStudentName = studentName;
        mYear = year;
        mGrades = grades;

    }

    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    public int getYear() {
        return mYear;
    }

    public void setYear(int year) {
        mYear = year;
    }

    public void addGrade(String newGrade) {
        mGrades.add(newGrade);
    }

    public void showGrades() {
        for (int i = 0; i < mGrades.size(); i++) {
            System.out.println(mGrades.get(i));
        }
    }


    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudent_name='" + mStudentName + '\'' +
                ", mClass_year=" + mYear +
                ", mGrades=" + mGrades +
                '}';
    }
}
