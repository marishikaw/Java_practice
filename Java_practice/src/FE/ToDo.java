package FE;

import java.util.UUID;

public class ToDo {
	public enum Priority{ LOW, MIDDLE, HIGH}
	public enum State{ NOT_YET_STARTED, STARTED, DONE}
	
	private static final String DEADLINE_PATTERN = "\\d{8}|\\d{12}"; // 8桁または12桁の数字の文字列と一致する正規表現
	private final String id;	// ID
	private String subject;		// 主題
	private String deadline;	// 期限
	private Priority priority;  // 重要度
	private State state;		// 状態
	
	private ToDo(String subject, String deadline, Priority priority, String id, State state) {
		// 期限が8桁または12桁ではない場合、エラーを返す
		if (!deadline.matches(DEADLINE_PATTERN)) {
			throw new IllegalArgumentException();
		}
		this.subject = subject;
		this.deadline = deadline;
		this.priority = priority;
		this.id = id;
		this.state = state;
	}
	
	// add
	public ToDo(String subject, String deadline, Priority priority) {
		// ユニークIDを生成
		this(subject, deadline, priority, UUID.randomUUID().toString(), State.NOT_YET_STARTED);
	}
	
	// update
	public ToDo(ToDo todo) {
		this(todo.subject, todo.deadline, todo.priority, todo.id, todo.state);
	}
	
	public String getSubject() { return subject; }
	public String getDeadline() { return deadline; }
	public Priority getPriority() { return priority; }
	public State getState() { return state; }
	public void setState(State state) { this.state = state; }
	public int hashCode() { return id.hashCode(); }
	// idが等価であるかどうかを判定
	// Object型のままではidを参照できないため、oをToDo型にキャスト（型変換）する。
	// ※上位クラスから下位クラスの変換の場合は明示的に行う必要がある
	// ((ToDo) o ).メソッド名　←カッコで囲む
	public boolean equals(Object o) {
		return o instanceof ToDo && ((ToDo) o).id.equals(id);
	}
	
	public String toString() {
		return String.format("主題: %s, 期限: %s, 優先度: %s, 状態: %s", subject, deadline, priority, state);
	}
}
