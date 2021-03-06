'use strict'

import gulp from 'gulp'
import { spawn } from 'child_process'

gulp.task('lint', () => {
  const cmd = spawn('yarn', ['lint'], { stdio: 'inherit' })
  cmd.on('close', () => cb())
})

gulp.task('default', ['lint'], () => {
  gulp.watch('src/**/*.js', ['lint'])
})