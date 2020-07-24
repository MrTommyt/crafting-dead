package com.craftingdead.core.client.renderer.item.model.attachment;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ModelM4A1IS2 extends Model {
  // fields
  ModelRenderer Shape1;
  ModelRenderer Shape2;
  ModelRenderer Shape3;
  ModelRenderer Shape4;

  public ModelM4A1IS2() {
    super(RenderType::getEntityCutoutNoCull);

    textureWidth = 64;
    textureHeight = 32;

    Shape1 = new ModelRenderer(this, 1, 14);
    Shape1.addCuboid(0F, 0F, 0F, 4, 1, 4);
    Shape1.setRotationPoint(0F, 0F, 0F);
    Shape1.setTextureSize(64, 32);
    Shape1.mirror = true;
    setRotation(Shape1, 0F, 0F, 0F);
    Shape2 = new ModelRenderer(this, 8, 9);
    Shape2.addCuboid(0F, -3F, 0F, 4, 3, 1);
    Shape2.setRotationPoint(0F, 1F, 0F);
    Shape2.setTextureSize(64, 32);
    Shape2.mirror = true;
    setRotation(Shape2, 0.1745329F, 0F, 0F);
    Shape3 = new ModelRenderer(this, 8, 9);
    Shape3.addCuboid(0F, -2F, -1F, 4, 3, 1);
    Shape3.setRotationPoint(0F, 0F, 4F);
    Shape3.setTextureSize(64, 32);
    Shape3.mirror = true;
    setRotation(Shape3, -0.1745329F, 0F, 0F);
    Shape4 = new ModelRenderer(this, 1, 8);
    Shape4.addCuboid(0F, -3F, 0F, 2, 4, 1);
    Shape4.setRotationPoint(1F, 0F, 1.5F);
    Shape4.setTextureSize(64, 32);
    Shape4.mirror = true;
    setRotation(Shape4, 0F, 0F, 0F);
  }

  @Override
  public void render(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int packedLight,
      int packedOverlay, float red, float green, float blue,
      float alpha) {
    Shape1.render(matrixStack, vertexBuilder, packedLight, packedOverlay, red, green,
        blue, alpha);
    Shape2.render(matrixStack, vertexBuilder, packedLight, packedOverlay, red, green,
        blue, alpha);
    Shape3.render(matrixStack, vertexBuilder, packedLight, packedOverlay, red, green,
        blue, alpha);
    Shape4.render(matrixStack, vertexBuilder, packedLight, packedOverlay, red, green,
        blue, alpha);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
