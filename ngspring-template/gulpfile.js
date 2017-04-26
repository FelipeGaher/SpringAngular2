var gulp = require('gulp'), 
	concat = require('gulp-concat'), 
	uglify = require('gulp-uglify'), 
	cleanCSS = require('gulp-clean-css');
    ts = require('gulp-typescript');
    folder = require('./gulp/paths/folder.js')
var path = require('path'); 
var addsrc = require('gulp-add-src');
    
gulp.task('js', function(){
	return gulp.src(path.join(folder.src, folder.typescript) + '*.parentcontroller.ts')
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/services/*.parentservice.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/models/*.model.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + 'services/*.service.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/services/*.service.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/services/app-services.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/constants/app-constants.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/constants/literal.constant.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/constants/navigateLink.constant.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/constants/genericDevelop.constant.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/controllers/*.controller.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/components/*.components.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '**/*.module.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + 'components/app-components.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '*.component.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + '*.controller.ts'))
    .pipe(addsrc.append(path.join(folder.src, folder.typescript) + 'app.ts'))
	.pipe(ts({
		noImplicitAny: true,
        out: 'app-ngspring.js' 
	}))
	.pipe(gulp.dest(path.join(folder.develop,folder.js)));
});

gulp.task('html', function(){
	  return gulp.src(path.join(folder.src)+'/**/*.html')
	  .pipe(gulp.dest(path.join(folder.develop,folder.templates)));
	});

gulp.task('css', function(){
	  return gulp.src('src/app/*.css')
	    .pipe(cleanCSS())
	    .pipe(gulp.dest(path.join(folder.develop,folder.css)));
	});

gulp.task('default', [ 'html', 'css', 'js']);