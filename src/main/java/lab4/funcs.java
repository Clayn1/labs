package lab4;
import java.util.Arrays;
import java.util.Comparator;

/**
 * C11=10 - Визначити клас студент, який складається як мінімум з 5-и полів
 */
public class funcs {
    public static void main(String[] args) {
        class student {
            private String name;
            private String secondName;
            private int course;
            private float averageMark;
            private String group;

            public student(String name, String secondName, int course, float averageMark, String group) {
                this.name = name;
                this.secondName = secondName;
                this.course = course;
                this.averageMark = averageMark;
                this.group = group;
            }

            public String getName() {
                return name;
            }

            public String getSecondName() {
                return secondName;
            }

            public float getAverageMark() {
                return averageMark;
            }
        }
        student[] students = new student[5];
        students[0] = new student("Vasya", "Tupin", 2, 95, "PK-71");
        students[1] = new student("Tolyan", "Pjatkin", 2, 86, "PK-71");
        students[2] = new student("Marichka", "Loopina", 2, 95, "PK-71");
        students[3] = new student("Vasya", "Gupin", 2, 71, "PK-71");
        students[4] = new student("Marichka", "Ivanova", 2, 92, "PK-71");
        Arrays.sort(students, Comparator.comparing(student::getName));
        for (int i = 1; i < 5; i++) {
            if (students[i].getName() == students[i - 1].getName()) {
                String shortSub;
                if (students[i].getSecondName().length() < students[i - 1].getSecondName().length()) {
                    shortSub = students[i].getSecondName();
                } else {
                    shortSub = students[i - 1].getSecondName();
                }
                for (int e = 0; e < shortSub.length(); e++) {
                    if (students[i].getSecondName().charAt(e) < students[i - 1].getSecondName().charAt(e)) {
                        student[] bufferArray = new student[1];
                        bufferArray[0] = students[i - 1];
                        students[i - 1] = students[i];
                        students[i] = bufferArray[0];
                        break;
                    }
                    else if (students[i].getSecondName().charAt(e) == students[i - 1].getSecondName().charAt(e)){
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
            // else {
            //     System.out.println(students[i].getName() + " " + students[i].getSecondName());
            // }
        }
        for (int k = 0; k < 5; k++) {
            System.out.println(students[k].getName() + " " + students[k].getSecondName());
        }
        Arrays.sort(students, Comparator.comparing(student::getAverageMark));
        for (int i = 1; i < 5; i++) {
            if (students[i].getAverageMark() == students[i - 1].getAverageMark()) {
                String shortSub;
                if (students[i].getSecondName().length() < students[i - 1].getSecondName().length()) {
                    shortSub = students[i].getSecondName();
                } else {
                    shortSub = students[i - 1].getSecondName();
                }
                for (int e = 0; e < shortSub.length(); e++) {
                    if (students[i].getSecondName().charAt(e) < students[i - 1].getSecondName().charAt(e)) {
                        student[] bufferMarkArray = new student[1];
                        bufferMarkArray[0] = students[i - 1];
                        students[i - 1] = students[i];
                        students[i] = bufferMarkArray[0];
                        break;
                    }
                    else if (students[i].getSecondName().charAt(e) == students[i - 1].getSecondName().charAt(e)){
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        for (int k = 0; k < 5; k++) {
            System.out.println(students[students.length - k - 1].getName() + " " + students[students.length - k - 1].getSecondName() + " " + students[students.length - k - 1].getAverageMark());
        }
    }
}