package FE;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<ToDo> todoList = new ArrayList<ToDo>();
	
	public void add(ToDo todo) {
		// すでにリストに保持されているToDoの場合は何もしない
		if (!todoList.contains(todo)) {
			todoList.add(new ToDo(todo));
		}
	}
	
	public void update(ToDo todo) {
		int index = todoList.indexOf(todo);
		// リストにないToDo（indecOfの戻り値が「-1」）の場合は何もしない
		if (index != -1) {
			todoList.set(index, todo);
		}
	}
	
	// 可変長引数
	public List<ToDo> select(Condition... conditions) {
		List<ToDo> result = new ArrayList<ToDo>();
		for (ToDo todo : todoList) {
			boolean selected = true;
			for (Condition condition : conditions) {
				// 条件に合う可動化の判定（Conditionのtestメソッドの戻り値）
				selected = condition.test(todo);
				if (!selected) break;
			}
			if (selected) {
				result.add(new ToDo(todo));
			}
		}
		return result;
	}
}
