package es.gaedrspace.pruebamenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomFragment extends Fragment {
	private final static String KEY_REG_TEXT = "texto";

	public static CustomFragment newInstance(String text) {
		CustomFragment frag = new CustomFragment();

		Bundle args = frag.getArguments();
		if (args == null)
			args = new Bundle();

		args.putString(KEY_REG_TEXT, text);

		frag.setArguments(args);

		return frag;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.tab1, container,false);
		TextView tvText =  (TextView)rootView.findViewById(R.id.tvText);
		String text = getArguments().getString(KEY_REG_TEXT);
		tvText.setText(text);
		return rootView;
	}

}
