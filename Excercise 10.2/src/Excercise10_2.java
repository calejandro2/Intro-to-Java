import ToolKit.BMI;
public class Excercise10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMI p = new BMI("Carlo", 22, 175, 5, 7);
        System.out.printf("Name: %s Age: %d weight: %.2f feet: %.2f inches: %.2f\n",
                p.getName(), p.getAge(), p.getWeight(), p.getFeet(), p.getInches());
	}

}
