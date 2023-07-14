package com.raven.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Model_Menu() {
    }

    private String icon;
    private String name;
    private MenuType type;

    public Icon toIcon() {
        try {
        if (icon == null) {
            throw new IllegalArgumentException("Biến icon không được để trống.");
        }

//        URL imageUrl = getClass().getResource("/icon" + icon + ".png");
ImageIcon imageUrl = new ImageIcon("D:/NetBeansProjects/java-ui-dashboard-001-main/part 3/ui-dashboard-001/src/com/raven/icon/"+icon+".png");
        ImageIcon imageIcon = new ImageIcon(imageUrl.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));

        if (imageUrl == null) {
            System.out.println(imageUrl);
            throw new IllegalArgumentException("Không tìm thấy tệp hình ảnh: " + icon + ".png");
        }
System.out.println(imageUrl);
        return imageIcon;
    } catch (Exception e) {
        // Xử lý ngoại lệ ở đây
        e.printStackTrace(); // In ra thông tin ngoại lệ để debug
        return null; // Hoặc trả về một biểu tượng mặc định hoặc giá trị khác tùy thuộc vào yêu cầu của bạn
    }
    }

    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
}
