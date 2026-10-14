import java.util.*;
void main() {
    Scanner in= new Scanner(System.in);
    float a=in.nextInt();
    float b=in.nextInt();
    float c=in.nextInt();
    float d=in.nextInt();
    float e=in.nextInt();
    float ans1 = calculateElectronics(a,b);
    float ans2= calculateFashion(c,d);
    float ans3 = calculateFood(e);
    float ans4 =totalBill(a,b,c,d,e);
    float ans5 = calculateDiscountedBill(a,b,c,d,e);
    System.out.println(ans1+" "+ans2+" "+ans3+" "+ans4+" "+ans5);
}
float calculateElectronics(float a,float b){
    float out=a+b+((a*18)/100)+((b*18)/100);
    return out;
}
float calculateFashion(float c,float d){
    float out=c+d+((c*13)/100)+((d*13)/100);
    return out;
}
float calculateFood(float e){
    float out = e + ((e*7)/100);
    return out;
}
float totalBill(float a,float b,float c,float d,float e){
    return calculateElectronics(a,b)+calculateFashion(c,d) +calculateFood(e);
}
float calculateDiscountedBill(float a,float b,float c,float d,float e){
    float out = totalBill(a,b,c,d,e);
    return out - ((out *20)/100);
}

