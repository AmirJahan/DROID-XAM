package dk.ostebaronen.droid.viewpagerindicator;


public class UnderlinePageIndicator
	extends android.view.View
	implements
		mono.android.IGCUserPeer,
		android.support.v4.view.ViewPager.OnPageChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onRestoreInstanceState:(Landroid/os/Parcelable;)V:GetOnRestoreInstanceState_Landroid_os_Parcelable_Handler\n" +
			"n_onSaveInstanceState:()Landroid/os/Parcelable;:GetOnSaveInstanceStateHandler\n" +
			"n_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"n_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"n_onPageSelected:(I)V:GetOnPageSelected_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"";
		mono.android.Runtime.register ("DK.Ostebaronen.Droid.ViewPagerIndicator.UnderlinePageIndicator, DK.Ostebaronen.Droid.ViewPagerIndicator", UnderlinePageIndicator.class, __md_methods);
	}


	public UnderlinePageIndicator (android.content.Context p0)
	{
		super (p0);
		if (getClass () == UnderlinePageIndicator.class)
			mono.android.TypeManager.Activate ("DK.Ostebaronen.Droid.ViewPagerIndicator.UnderlinePageIndicator, DK.Ostebaronen.Droid.ViewPagerIndicator", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public UnderlinePageIndicator (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == UnderlinePageIndicator.class)
			mono.android.TypeManager.Activate ("DK.Ostebaronen.Droid.ViewPagerIndicator.UnderlinePageIndicator, DK.Ostebaronen.Droid.ViewPagerIndicator", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public UnderlinePageIndicator (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == UnderlinePageIndicator.class)
			mono.android.TypeManager.Activate ("DK.Ostebaronen.Droid.ViewPagerIndicator.UnderlinePageIndicator, DK.Ostebaronen.Droid.ViewPagerIndicator", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public UnderlinePageIndicator (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == UnderlinePageIndicator.class)
			mono.android.TypeManager.Activate ("DK.Ostebaronen.Droid.ViewPagerIndicator.UnderlinePageIndicator, DK.Ostebaronen.Droid.ViewPagerIndicator", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public void onRestoreInstanceState (android.os.Parcelable p0)
	{
		n_onRestoreInstanceState (p0);
	}

	private native void n_onRestoreInstanceState (android.os.Parcelable p0);


	public android.os.Parcelable onSaveInstanceState ()
	{
		return n_onSaveInstanceState ();
	}

	private native android.os.Parcelable n_onSaveInstanceState ();


	public void onPageScrollStateChanged (int p0)
	{
		n_onPageScrollStateChanged (p0);
	}

	private native void n_onPageScrollStateChanged (int p0);


	public void onPageScrolled (int p0, float p1, int p2)
	{
		n_onPageScrolled (p0, p1, p2);
	}

	private native void n_onPageScrolled (int p0, float p1, int p2);


	public void onPageSelected (int p0)
	{
		n_onPageSelected (p0);
	}

	private native void n_onPageSelected (int p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
