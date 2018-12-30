import java.util.ArrayList;

public class GradeAnalyzer {

	// Constructeur
	public GradeAnalyzer() {

	}

	// Méthode
	public int getAverage(ArrayList<Integer> grades) {

		int sum = 0;

		if (grades.size() < 1) {
			System.out.println("Error : the ArrayList is empty !");
			return 0;
		} else {
			for (Integer grade : grades) {
				sum = sum + grade;
			}

			int average = sum / grades.size();
			System.out.println(average);
			return average;
		}
	}

	// Main
	public static void main(String[] args) {
		ArrayList<Integer> myClassroom = new ArrayList<Integer>();
		myClassroom.add(98);
		myClassroom.add(92);
		myClassroom.add(88);
		myClassroom.add(75);
		myClassroom.add(61);
		myClassroom.add(89);
		myClassroom.add(95);
		GradeAnalyzer myAnalyzer = new GradeAnalyzer();
		myAnalyzer.getAverage(myClassroom);

	}
}