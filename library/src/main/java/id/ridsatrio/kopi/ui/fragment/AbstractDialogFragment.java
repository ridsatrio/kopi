package id.ridsatrio.kopi.ui.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * A base for building dialog fragments.
 * <p>
 * This class will handle view initialisations for you; all you'd need
 * to do is to supply your layout's and menu's resource ID, and annotate
 * your view widgets with the standard ButterKnife annotations. (Yep,
 * this class uses ButterKnife to further minimise boilerplate codes.)
 * <p>
 * Created by Ridho Hadi Satrio on 8/19/15.
 */
public abstract class AbstractDialogFragment extends DialogFragment {

  @NonNull
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    final Dialog dialog = new Dialog(getActivity());

    onDialogCreated(dialog);

    return dialog;
  }

  public void onDialogCreated(Dialog dialog) {
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    return inflater.inflate(getLayoutResId(), container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    ButterKnife.bind(this, view);
  }

  @LayoutRes
  protected abstract int getLayoutResId();
}
