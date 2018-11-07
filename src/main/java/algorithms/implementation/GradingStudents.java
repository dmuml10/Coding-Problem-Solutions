package algorithms.implementation;

public class GradingStudents {

    static int[] gradingStudents(int[] grades) {
        for (int i=0; i<grades.length; i++) {
            if (grades[i] >= 38) {
                if (grades[i] % 5 != 0 && grades[i] % 5 >= 3) {
                    grades[i] += 5 - (grades[i] % 5);
                }
            }
        }
        return grades;
    }

}
