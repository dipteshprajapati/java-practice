/**
 * array
 */
class practice {
    public static void main(String[] args) {

        int[] marks={70,80,40,39,45,74,39};
        int result = 0;
        int i;
        // print marks 
        System.out.println("marks list:-");
        for(i=0;i<marks.length;i++)
        {
            System.out.println("mark: "+marks[i]);
        }
        // avarage of marks
        for(i=0;i<marks.length;i++)
            {
                result=result+marks[i];
            }  
            System.out.println("Avarage of marks is: "+result/marks.length);
    }
}