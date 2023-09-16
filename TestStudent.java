class Course {
    String courseId;
    String courseName;
    double credits;

    Course(String id, String name, double c) {
        this.courseId = id;
        this.courseName = name;
        this.credits = c;
    }   
}

class Student {
    String id;
    String name;
    Course[] courses;

    Student(String id, String name, Course[] courses){
        this.id = id;
        this.name = name;
        setCourses(courses);
    }

    void setCourses(Course[] c) {
        if (c.length >=2 ) {
            this.courses = c;
        } 
        else {
            System.out.println("Min number of courses 2");
        }
    }

    public void display() {
        String[][] data = new String[5][5];
        data[0][0] = "Student Id";
        data[0][1] = "Student Name";
        data[0][2] = "Course Id";
        data[0][3] = "Course Name";
        data[0][4] = "Credits";
        int n = courses.length;
        for(int i = 1; i <= n ; i++){
            data[i][0] = id;
            data[i][1] = name;
            data[i][2] = courses[i-1].courseId;
            data[i][3] = courses[i-1].courseName;
            data[i][4] = String.valueOf(courses[i-1].credits);
        }

        
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j<5; j++) {
                System.out.print("+");
                for(int k = 0; k< 20; k++) {
                    System.out.print('-');
                }    
            }
            System.out.print("+");
            System.out.println();
            
            for(int b = 0; b<5; b++) {
                System.out.printf("| %-18s ", data[i][b]);
            }
            System.out.print('|');
            System.out.println();  
        }
        for(int j = 0; j<5; j++) {
            System.out.print("+");
            for(int k = 0; k< 20; k++) {
                System.out.print('-');
            }    
        }
        System.out.println("+");
        System.out.println();
    }
}


class Undergraduate extends Student {
    Undergraduate(String id, String name, Course[] courses) {
        super(id, name, courses);
    }
}

class Graduate extends Student {
    Graduate(String id, String name, Course[] courses) {
        super(id, name, courses);
    }
}

class Fresher extends Undergraduate {
    Fresher(String id, String name, Course[] courses) {
        super(id, name, courses);
    }
}

class Sophomore extends Undergraduate {
    Sophomore(String id, String name, Course[] courses) {
        super(id, name, courses);
    }
}

class Junior extends Undergraduate {
    Junior(String id, String name, Course[] courses) {
        super(id, name, courses);
    }
}


class Senior extends Undergraduate {
    Senior(String id, String name, Course[] courses) {
        super(id, name, courses);
    }
}


class Master extends Graduate {
    Master(String id, String name, Course[] courses) {
        super(id, name, courses);
    }
} 

class Doctoral extends Graduate {
    Doctoral(String id, String name, Course[] courses) {
        super(id, name, courses);
    }
}


class TestStudent {
    public static void main(String args[]) {
        Course[] courses = new Course[10];
        String[] courseName = {"M1", "Python", "C", "Advanced python", "Java", "DBMS", "OS", "Deep learning", "Machine Leaning", "NLP"};
        double[] credits = {3, 3, 2, 4, 4, 4, 4, 3, 5, 5};   
        for(int i = 0; i < 10; i++ ) {
            courses[i] = new Course("c"+String.valueOf(i+1), courseName[i], credits[i]);
        }
        Course[] c1 = {courses[0], courses[1], courses[2]};
        Fresher s1 = new Fresher("s1", "vivek", c1);
        s1.display();
        
        Course[] c2 = {courses[3], courses[4], courses[5]};
        Sophomore s2 = new Sophomore("s2", "hemakesh", c2);
        s2.display();

        Course[] c3 = {courses[6], courses[7]};
        Junior s3 = new Junior("s3","veda", c3);
        s3.display();

        Course[] c4 = {courses[9], courses[8]};
        Junior s4 = new Junior("s4","arun", c4);
        s4.display();       
    }
}
