public class TestPerson {
   public static void main(String[] args) {
      /* Test Student class */
      Student s1 = new Student("Mario Rossi", "Via Commercio 18");
//      System.out.println(s1); viene sostituito da this in printGrades()
      s1.addCourseGrade("Elettronica", 29);
      s1.addCourseGrade("Automatica", 19);
      s1.printGrades();
      System.out.println("Media voti s1:  " + s1.getAverageGrade()+ "\n");
      
      /* Test Teacher class */
      Teacher t1 = new Teacher("Luigi BIanchi", "Via Giorgi 23");
      System.out.println(t1);
      String[]courses = {"Elettronica", "Automatica", "Infomatica", "Elettronica"};//array delle richieste
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " aggiunta.");
         }
         else {
            System.out.println(course + " non aggiunta.");
         }
      }
      System.out.println();
      
      t1.StampaCorsi();
      
      System.out.println();
      for (String course: courses) {
         if (t1.removeCourse(course)) {
            System.out.println(course + " rimossa.");
         } else {
            System.out.println(course + " non rimossa.");
         }
      }
      
      System.out.println();

      t1.StampaCorsi();
      
   }
}