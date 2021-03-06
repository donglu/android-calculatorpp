package org.solovyev.android.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.solovyev.android.calculator.about.CalculatorFragmentType;

/**
 * User: serso
 * Date: 9/25/12
 * Time: 10:31 PM
 */
public interface CalculatorActivityHelper {

    void onCreate(@NotNull SherlockFragmentActivity activity, @Nullable Bundle savedInstanceState);
    void onCreate(@NotNull Activity activity, @Nullable Bundle savedInstanceState);

    void onSaveInstanceState(@NotNull SherlockFragmentActivity activity, @NotNull Bundle outState);
    void onSaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState);

    int getLayoutId();

    @NotNull
    CalculatorPreferences.Gui.Theme getTheme();

    @NotNull
    CalculatorPreferences.Gui.Layout getLayout();

    void onResume(@NotNull SherlockFragmentActivity activity);
    void onResume(@NotNull Activity activity);

    void onPause(@NotNull Activity activity);
    void onPause(@NotNull SherlockFragmentActivity activity);

    void onDestroy(@NotNull SherlockFragmentActivity activity);
    void onDestroy(@NotNull Activity activity);

    void addTab(@NotNull SherlockFragmentActivity activity,
                @NotNull String tag,
                @NotNull Class<? extends Fragment> fragmentClass,
                @Nullable Bundle fragmentArgs,
                int captionResId,
                int parentViewId);

    void addTab(@NotNull SherlockFragmentActivity activity,
                @NotNull CalculatorFragmentType fragmentType,
                @Nullable Bundle fragmentArgs,
                int parentViewId);

    void setFragment(@NotNull SherlockFragmentActivity activity,
                    @NotNull CalculatorFragmentType fragmentType,
                    @Nullable Bundle fragmentArgs,
                    int parentViewId);


    void logDebug(@NotNull String message);

    void processButtons(@NotNull Activity activity, @NotNull View root);

    void logError(@NotNull String message);
}
