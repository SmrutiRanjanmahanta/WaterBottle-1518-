

public class waterbottle {
    public static int waterbottles(int nbottle,int exchange){
        int x=nbottle;
        while(nbottle>exchange){
            int mid=nbottle/exchange;
            int rim=nbottle % exchange;
            x=x+mid;
            nbottle=mid+rim;
    }
    return x;
}
    public static void main(String[] args) {
        System.out.println(waterbottles(15, 4));
    }
}
