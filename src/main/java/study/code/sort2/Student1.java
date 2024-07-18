package study.code.sort2;

public class Student1 implements Comparable<Student1>{
    private String name;
    private int score;

    public Student1(String name, int score) {
        this.setName(name);
        this.setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // 파라미터는 해당 클래스 뒤의 값.
    @Override
    public int compareTo(Student1 compre) {
        // 해당 메서드의 결과가 1이면 앞뒤 치환, 0보다 크거나 같다면 변환 없음
        return this.getScore() < compre.getScore() ? 1 : -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("이름 : " + this.getName());
        sb.append(", 점수 : " + this.getScore());
        return sb.toString();
    }
}