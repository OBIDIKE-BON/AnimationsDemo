package com.sriyank.animationsdemo

import android.animation.Animator
import android.animation.AnimatorInflater
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), Animator.AnimatorListener {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

	}

	fun rotateAnimation(view: View) {

		val rotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
		rotateAnimator?.apply {
			setTarget(targetImage)
			start()
		}
	}

	fun scaleAnimation(view: View) {

		val scaleAnimator = AnimatorInflater.loadAnimator(this, R.animator.scale)
		scaleAnimator?.apply {
			setTarget(targetImage)
			start()
		}
	}

	fun translateAnimation(view: View) {

		val translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translate)
		translateAnimator?.apply {
			setTarget(targetImage)
			start()
		}
	}

	fun fadeAnimation(view: View) {

		val fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha)
		fadeAnimator?.apply {
			setTarget(targetImage)
			start()
		}
	}

	// Implementation of AnimatorListener interface
	override fun onAnimationStart(animation: Animator?) {

		Toast.makeText(this, "Animation Started", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationRepeat(animation: Animator?) {

		Toast.makeText(this, "Animation Repeated", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationEnd(animation: Animator?) {

		Toast.makeText(this, "Animation Ended", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationCancel(animation: Animator?) {

		Toast.makeText(this, "Animation Cancelled", Toast.LENGTH_SHORT).show()
	}
}
