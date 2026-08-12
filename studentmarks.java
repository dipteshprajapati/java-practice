/**
 * array
 */
class studentmarks {
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
        // average of marks
        for(i=0;i<marks.length;i++)
            {
                result=result+marks[i];
            }  
            double avg = result/marks.length;
            System.out.println("average of the marks: "+avg);

        // number of student who scored above average
        // above avrage list =  aa
        int aa=0;
        System.out.println("student who scored above the avrage");
        for(i=0;i<marks.length;i++)
        {
            if(marks[i]>avg)
            {
                aa=marks[i];
                System.out.println("marks above the average: "+aa);
            }
        }

        // highest marks
        int max = marks[0];
        for(i=1;i<marks.length;i++)
        {
            if(marks[i]>max)
            {
                max = marks[i];
            }
        }
        System.out.println("Maximum mark is: "+max);

        // second highest marks
        // second highest = sh
        int sh=0;
        for(i=0;i<marks.length;i++)
        {
            if(marks[i]>max)
            {
               sh=max;
               max=marks[i]; 
            }
            else if(marks[i]>sh && marks[i]<max)
            {
                sh=marks[i];
            }
        }
        System.out.println("Second highest mark is: "+sh);

        //number of student who fail(marks<40)
        //fail student = fs
        int fs = 0;
        for(i=0;i<marks.length;i++)
        {
            if(marks[i]<40)
            {
                fs=marks[i];
                System.out.println("fail student: "+fs);
            }
        }

        //top 3 highest marks
        //thired highest = th
        int th = 0;
        System.out.println("top 3 highest marks: ");
       for(i = 0; i < marks.length; i++)
        {   
            if(marks[i] < sh && marks[i] > th)
            {
                th = marks[i];
            }
        }

        System.out.println("1st highest = "+max);
        System.out.println("2nd highest = "+sh);
        System.out.println("3rd highest = "+th);
    }
}