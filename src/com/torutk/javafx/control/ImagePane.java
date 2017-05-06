/*
 * © 2017 TAKAHASHI,Toru
 */
package com.torutk.javafx.control;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * Resizable ImageView
 * 
 */
public class ImagePane extends Pane {
    private ImageView iv;

    public ImagePane() {
        iv = new ImageView();
    }
    
    public ImagePane(String imageUrl) {
        iv = new ImageView(imageUrl);
        adjustSize();
    }
    
    private void adjustSize() {
        setPrefSize(iv.getImage().getWidth(), iv.getImage().getHeight());
        iv.fitWidthProperty().bind(widthProperty());
        iv.fitHeightProperty().bind(heightProperty());
        getChildren().add(iv);
    }
    
    public void setImage(Image image) {
        iv.setImage(image);
        adjustSize();
    }
    
    public Image getImage() {
        return iv.getImage();
    }
    
    public ObjectProperty<Image> imageProperty() {
        return iv.imageProperty();
    }
    
    public void setPreserveRatio(boolean isPreserve) {
        iv.setPreserveRatio(isPreserve);
    }
    
    public boolean isPreserveRatio() {
        return iv.isPreserveRatio();
    }
    
    public BooleanProperty preserveRatioProperty() {
        return iv.preserveRatioProperty();
    }
    
}
