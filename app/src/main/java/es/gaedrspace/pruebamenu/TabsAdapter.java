package es.gaedrspace.pruebamenu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {

	public TabsAdapter(FragmentManager fm) {
        super(fm);
	}

	@Override
	public Fragment getItem(int index) {
		if(index < 4) {
			switch(index) {
			case 0:
				return CustomFragment.newInstance("こんにちわ！！");
			case 1:
				return CustomFragment.newInstance("二番 Fragment");
			case 2:
				return CustomFragment.newInstance("This is the third tab");
			}
		}
		return null;
	}

	@Override
	public int getCount() {
        return 3;
	}

}
