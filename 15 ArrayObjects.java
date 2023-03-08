class Students{

    // Defining intance variables
    int rollno;
    String name;
    int marks;
}

public class ArrayObjects{

    public static void main(String args[]){

        Students s1 = new Students();
        s1.rollno = 1147;
        s1.name = "Puran";
        s1.marks = 84;

        Students s2 = new Students();
        s2.rollno = 1220;
        s2.name = "Sodhi";
        s2.marks = 94;

        Students s3 = new Students();
        s3.rollno = 1200;
        s3.name = "Rashmeet";
        s3.marks = 90;

        // Creating an array that will hold student references
        Students stu[] = new Students[3];

        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        // System.out.println(stu[1].name);
        // Displaying Student names and marks

        // for(int i = 0; i < stu.length; i++){
        //         System.out.println(stu[i].name + ": " + stu[i].marks);
        // }

        // Using enhanced for loop for displaying same result
        for (Students stua: stu){
            System.out.println(stua.name + ": " + stua.marks);
        }
    }
}