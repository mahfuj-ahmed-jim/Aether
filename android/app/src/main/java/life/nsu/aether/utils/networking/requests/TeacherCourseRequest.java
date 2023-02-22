/*
 * TeacherCourseRequest Created by Mahfuj Ahmed Jim
 * Last modified  2/23/23, 3:59 AM
 * Copyright (c) 2023. All rights reserved.
 *
 */

package life.nsu.aether.utils.networking.requests;

public class TeacherCourseRequest {

    private String courseId;
    private boolean archive;

    public TeacherCourseRequest(String courseId) {
        this.courseId = courseId;
    }

    public TeacherCourseRequest(String courseId, boolean archive) {
        this.courseId = courseId;
        this.archive = archive;
    }

}
