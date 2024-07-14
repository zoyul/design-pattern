package org.example.command.command3;

// 커맨드 인터페이스는 execute 메서드 하나만 있으면 된다
public interface Command {
    void execute();
    // undo 메서드 추가
    void undo();
}
