package org.example.composite.menu3;

import javax.swing.*;

public class CompositePatternExample {

    private static void createAndShowGUI() {
        // JFrame 생성
        JFrame frame = new JFrame("Composite Pattern Example");
        frame.setSize(300, 200);

        // JPanel 생성 (Container)
        JPanel panel = new JPanel();

        // JButton과 JLabel 생성 (Component)
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Hello, World!");

        // JButton과 JLabel을 JPanel에 추가
        panel.add(button);
        panel.add(label);

        // JPanel을 JFrame에 추가
        frame.add(panel);

        // JFrame을 보이게 설정
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // GUI 업데이트는 EDT에서 실행해야 함
        SwingUtilities.invokeLater(CompositePatternExample::createAndShowGUI);
    }
}
