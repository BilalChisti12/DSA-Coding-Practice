import java.util.Scanner;
public class gpaCalculator {
    static float[] getGrades(String[] grades, float[] s1marks, float[] s2marks){
        float[] res = new float[grades.length];
        for(int i=0; i< grades.length; i++){
            switch(grades[i].toUpperCase()){
                case "O":
                    res[i] = 10;
                    break;
                case "A+":
                    res[i] = 9;
                    break;
                case "A":
                    res[i] = 8;
                    break;
                case "B+":
                    res[i] = 7;
                    break;
                case "B":
                    res[i] = 6;
                    break;
                case "C":
                    res[i] = 5;
                    break;
                case "P":
                    res[i] = 4;
                    break;
                case "AB":
                    res[i] = 0;
                    break;
                case "I":
                    if(s1marks[i]+s2marks[i] <25){
                        res[i] =0;
                    }
                    else{
                        res[i] = 4;
                    }
                    break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Subjects: ");
        int n = sc.nextInt();

        float[] s1marks = new float[n];
        float[] s2marks = new float[n];
        String[] s1grades = new String[n];
        String[] intgrades = new String[n];
        String[] s2grades = new String[n];
        float[] credits = new float[n];
        float[] labCred = new float[n];
        float allCredits = 1;

        for(int i=0; i<n; i++){
            System.out.print("Enter the total credits of the Subject "+(i+1)+": ");
            credits[i] = sc.nextFloat();
            allCredits += credits[i];
            System.out.print("Enter Sessional - 1 marks of Subject "+(i+1)+": ");
            s1marks[i] = sc.nextFloat();
            System.out.print("Enter Sessional - 1 grade of Subject "+(i+1)+": ");
            s1grades[i] = sc.next();
            System.out.print("Enter Internal Grade of Subject "+(i+1)+": ");
            intgrades[i] = sc.next();
            System.out.print("Enter Sessional - 2 marks of Subject "+(i+1)+": ");
            s2marks[i] = sc.nextFloat();
            System.out.print("Enter Sessional - 2 grade of Subject "+(i+1)+": ");
            s2grades[i] = sc.next();
            if(credits[i] == 4){
                System.out.print("Enter the Lab Marks of Subject "+(i+1)+": ");
                labCred[i] = sc.nextFloat();
                labCred[i] = labCred[i] >= 90 ? 10 : (labCred[i] >= 80 ? 9 : (labCred[i] >= 70 ? 8 : (labCred[i] >= 60 ? 7 : (labCred[i] >= 50 ? 6 : 0))));
                if(labCred[i] == 0){
                    System.out.print("You failed in Lab of Subject "+i+1+".");
                }
            }
        }

        float[] s1gp = getGrades(s1grades, s1marks, s2marks);
        float[] s2gp = getGrades(s2grades, s1marks,s2marks);
        float[] intgp = getGrades(intgrades, s1marks, s2marks);
        float[] totGP = new float[n];
        for(int i=0; i<n; i++){
            if(s1gp[i] != 0 && s2gp[i] != 0 && intgp[i] != 0) {
                if (credits[i] == 3) {
                    totGP[i] = (int)Math.ceil((0.3 * s1gp[i]) + (0.25 * intgp[i]) + (0.45 * s2gp[i]));
                }
                else if(credits[i] == 4 && labCred[i] != 0) {
                    totGP[i] = (int)Math.ceil((0.75 * ((0.3 * s1gp[i]) + (0.25 * intgp[i]) + (0.45 * s2gp[i]))) + labCred[i] * 0.25);
                }
            }
            else{
                totGP[i] = 0;
            }
        }
        System.out.print("Enter your CLAD marks: ");
        int clad = sc.nextInt();
        float stuCred = clad >= 90 ? 10 : (clad >= 80 ? 9 : (clad >= 70 ? 8 : (clad >= 60 ? 7 : (clad >= 50 ? 6 : 0))));
        float sgpa;
        for(int i=0; i<n; i++){
            stuCred += (totGP[i]*credits[i]);
        }
        sgpa = stuCred/allCredits;
        System.out.print("Your Calculated SGPA will be: "+sgpa);
    }
}