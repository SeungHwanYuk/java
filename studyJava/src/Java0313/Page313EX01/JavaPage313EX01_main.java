package Java0313.Page313EX01;
    class Human {
        public String name;
        public int age;

        public void eat() {
        }

        public void sleep() {
        }
    }

   class Student extends Human {
        public int studentsID;

        public void goToSchool() {
        }
    }

   class Worker extends Human {
        public int workerID;

        public void goToWork() {
        }
    }


public class JavaPage313EX01_main {
        public static void main(String[] args) {
          Human h = new Human();
            h.name = "김현지";
            h.age = 11;
            h.eat();
            h.sleep();

            Student s = new Student();
            s.name = "김민성";
            s.age = 16;
            s.studentsID = 128;
            s.eat();
            s.sleep();
            s.goToSchool();

          Worker w = new Worker();
            w.name = "봉윤정";
            w.age = 45;
            w.workerID = 128;
            w.eat();
            w.sleep();
            w.goToWork();
        }
    }
