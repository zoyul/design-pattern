package org.example.command.command4;

// 커맨드 인터페이스는 execute 메서드 하나만 있으면 된다
public interface Command {
    void execute();
    void undo();
}
