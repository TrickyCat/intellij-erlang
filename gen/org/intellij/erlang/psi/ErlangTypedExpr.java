// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ErlangTypedExpr extends ErlangNamedElement {

  @Nullable
  ErlangExpression getExpression();

  @Nullable
  ErlangMacros getMacros();

  @NotNull
  ErlangQAtom getQAtom();

  @Nullable
  ErlangRecordField getRecordField();

  @Nullable
  ErlangRecordRef getRecordRef();

  @Nullable
  ErlangRecordTuple getRecordTuple();

  @Nullable
  ErlangTopType getTopType();

  @NotNull
  String getName();

  @NotNull
  PsiElement setName(String newName);

  @NotNull
  PsiElement getNameIdentifier();

  int getTextOffset();

}
