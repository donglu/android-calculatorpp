package org.solovyev.android.calculator;

import org.jetbrains.annotations.NotNull;

/**
 * User: Solovyev_S
 * Date: 21.09.12
 * Time: 11:48
 */
public interface CalculatorEditorView {

    void setState(@NotNull CalculatorEditorViewState viewState);
}
