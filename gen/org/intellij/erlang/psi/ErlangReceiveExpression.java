// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ErlangReceiveExpression extends ErlangExpression {

  @Nullable
  ErlangAfterClause getAfterClause();

  @Nullable
  ErlangCrClauses getCrClauses();

  @Nullable
  PsiElement getEnd();

  @NotNull
  PsiElement getReceive();

}
