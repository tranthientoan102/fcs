import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainForStudent {

	ArrayList<Student> sortedList = new ArrayList<>();

	public static void main(String[] args) {
		MainForStudent mainForStudent = new MainForStudent();

		List<String> data = readData("data.txt");
		Student[] studentArray = new Student[data.size()];
		for (int i = 0; i < data.size(); i++) {
			try {
				studentArray[i] = new Student(data.get(i).split(" "));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		mainForStudent.sortStudents(studentArray);
		mainForStudent.printStudents(mainForStudent.sortedList.toArray(new Student[0]));

	}

	int columnFixedWidth = 20;
	public void printStudents(Student[] students){
		StringBuilder builder = new StringBuilder();
//		builder.append("Student\t\t\tAverageScore\tPhysic\tChemistry\tMaths\n");
		builder.append(printString("Student"))
				.append(printString("AverageScore"))
				.append(printString("Physic"))
				.append(printString("Chemistry"))
				.append(printString("Maths"))
				.append("\n");
		for (Student student: students){
			if (student!=null)
				builder.append(printString(student.getName()))
						.append(printString(student.getAverage().toString()))
						.append(printString(student.getPhysic().toString()))
						.append(printString(student.getChemistry().toString()))
						.append(printString(student.getMath().toString()))
						.append("\n");
			else builder.append(printString("????"))
						  .append(printString("????"))
						  .append(printString("????"))
						  .append(printString("????"))
						  .append(printString("????"))
						 .append("\n");
		}
		System.out.println(builder.toString());
	}

	private String printString(String content){
		return printString(content, columnFixedWidth);
	}
	private String printString(String content, int maxLength){
		if (content.length()> maxLength-3){
			content = content.substring(0,maxLength-3) + "...";
		} else {
			content = String.format("%-"+maxLength + "." + maxLength + "s", content);
		}
		return content;

	}

	public void sortStudents(Student[] students) {
		sortedList.clear();
		for (Student student : students) {
			findAndInsert(student);
		}

	}

	private void findAndInsert(Student student) {

		int index = sortedList.size() - 1;
		if (student == null) {
			insertPosition(index + 1, student);
			return;
		}

		if (index == -1) {
			insertPosition(0, student);
		}
		else {
			for (; index >= 0; index--) {
				Student pivot = sortedList.get(index);
				if (pivot!=null && student.hasHigherRank(pivot)<=0) {
					insertPosition(index + 1, student);
					break;
				} else if (index == 0) {
					insertPosition(0, student);
				}
			}
		}

	}

	private void insertPosition(int index, Student student) {
		sortedList.add(index, student);
	}


	public static List<String> readData(String filename){
		List<String> lines = Collections.emptyList();
		try {
			lines =
					 Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
		} catch (IOException e) {

			// do something
			e.printStackTrace();
		}
		return lines;
	}
}
